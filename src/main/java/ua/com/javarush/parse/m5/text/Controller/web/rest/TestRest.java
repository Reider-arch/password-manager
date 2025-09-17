package ua.com.javarush.parse.m5.text.Controller.web.rest;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ua.com.javarush.parse.m5.text.entity.VaultItem;
import ua.com.javarush.parse.m5.text.repository.VaultItemRepository;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1/test")
public class TestRest {


        private final VaultItemRepository vaultItemRepository;


    @PostMapping("/create")
    public ResponseEntity<VaultItem> save(@RequestBody VaultItem item ) {
        VaultItem vaultItem = vaultItemRepository.save(item);
        return  new ResponseEntity<VaultItem>(vaultItemRepository.save(item), HttpStatus.CREATED);
    }


    @GetMapping("/getall")
    public ResponseEntity<List<VaultItem>> getAll() {
        return new ResponseEntity<>(vaultItemRepository.findAll(), HttpStatus.OK);
    }
}
