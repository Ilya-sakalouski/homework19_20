package ru.mail.ilya6697089.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mail.ilya6697089.service.model.ItemDTO;

@RestController
@RequestMapping("/api/items")
public class ItemAPIController {
    private Random random = new Random();
    private Map<Integer, ItemDTO> items = new HashMap<>();

    @GetMapping(value = "/{id}")
    public ItemDTO getItem(@PathVariable(name = "id") Integer id) {
        return items.get(id);
    }

    @PostMapping
    public ItemDTO saveItem(@RequestBody ItemDTO item){
        return items.put(random.nextInt(), item);
    }

    @GetMapping
    public List<ItemDTO> saveItem() {
        return new ArrayList<>(items.values());
    }

    @DeleteMapping(value = "/{id}")
    public ItemDTO deleteItem(@PathVariable(name = "id") Integer id) {
        return items.remove(id);
    }

}
