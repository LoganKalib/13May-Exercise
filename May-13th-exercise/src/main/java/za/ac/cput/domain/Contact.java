package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.util.Objects;

@Entity
public class Contact {
    @Id
    private String email;

    private String mobile;

    private String workTel;

    protected Contact() {
    }
    private Contact(Builder build) {
        this.email = build.email;
        this.mobile = build.mobile;
        this.workTel = build.workTel;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWorkTel() {
        return workTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(email, contact.email) && Objects.equals(mobile, contact.mobile) && Objects.equals(workTel, contact.workTel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, mobile, workTel);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", workTel='" + workTel + '\'' +
                '}';
    }

    public static class Builder{
        private String email;

        private String mobile;

        private String workTel;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setWorkTel(String workTel) {
            this.workTel = workTel;
            return this;
        }

        public Builder copy(Contact obj){
            this.email = obj.email;
            this.mobile = obj.mobile;
            this.workTel = obj.workTel;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }
}
