package ru.mail.ilya6697089.service;

import java.util.List;

import ru.mail.ilya6697089.service.model.ItemDTO;

public interface ItemService {

    List<ItemDTO> findAll();

    void add(ItemDTO itemDTO);

    ItemDTO findById(Long id);

}
