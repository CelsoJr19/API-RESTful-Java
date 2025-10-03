package com.minicurso.bank_api.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String cpf;

    public UserEntity(Long id, String name, String email, String phone, String cpfS) {
        setId(id);
        setName(name);
        setEmail(email);
        setPhone(phone);
        setCpf(cpf);
    }

        public UserEntity() {}

        //////////////////////////////////////
        //               GETs               //
        //////////////////////////////////////
        
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getCpf() {
            return cpf;
        }

        //////////////////////////////////////
        //               SETs               //
        //////////////////////////////////////
        
        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
}
