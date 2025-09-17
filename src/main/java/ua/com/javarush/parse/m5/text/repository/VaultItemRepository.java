package ua.com.javarush.parse.m5.text.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.javarush.parse.m5.text.entity.VaultItem;

public interface VaultItemRepository extends JpaRepository<VaultItem, Long> {
}
