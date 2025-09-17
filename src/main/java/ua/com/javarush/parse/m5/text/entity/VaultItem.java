package ua.com.javarush.parse.m5.text.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VaultItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;

    private String description;

    private String login;

    private String password;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        VaultItem vaultItem = (VaultItem) o;
        return id == vaultItem.id && Objects.equals(name, vaultItem.name) && Objects.equals(description, vaultItem.description) && Objects.equals(login, vaultItem.login) && Objects.equals(password, vaultItem.password);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(description);
        result = 31 * result + Objects.hashCode(login);
        result = 31 * result + Objects.hashCode(password);
        return result;
    }
}
