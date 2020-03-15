package ru.mail.ilya6697089.web.controller;

import java.util.List;
import javax.validation.Valid;

import ru.mail.ilya6697089.service.ItemService;
import ru.mail.ilya6697089.service.model.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public String getItems(Model model) {
        List<ItemDTO> items = itemService.findAll();
        model.addAttribute("items", items);
        return "items";
    }

    @GetMapping("/{id}")
    public String getItems(@PathVariable Long id, Model model) {
        ItemDTO item = itemService.findById(id);
        model.addAttribute("item", item);
        return "item";
    }

    @GetMapping("/add")
    public String addItemPage(Model model) {
        model.addAttribute("item", new ItemDTO());
        return "item_add";
    }

    @PostMapping
    public String addItem(
            @Valid @ModelAttribute(name = "item") ItemDTO item,
            BindingResult bindingResult,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("item", item);
            return "item_add";
        }
        itemService.add(item);
        return "redirect:/items";
    }

}
