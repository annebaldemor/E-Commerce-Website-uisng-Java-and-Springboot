package com.middle.app.midrest.Services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import com.middle.app.midrest.Models.Item;
import com.middle.app.midrest.Repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ItemService {

    @Autowired
    private ItemRepo repository;

    @PostConstruct
    public void initDB() {
        repository.saveAll(Stream.of(new Item(101, "Dell 32 Curved Gaming Monitor – S3222DGM", 15900),
                new Item(102, "Intel® Core™ i9-12900K Processor", 78000), new Item(103, "ASUS TUF RTX 3090 TI GAMING OC TUF-RTX3090TI-O24G-GAMING"
                        ,103300), new Item(104, "Crucial Ballistix MAX 5100 MHz DDR4 DRAM Desktop Gaming Memory Kit 16GB (8GBx2) CL19 BLM2K8G51C19U4B (Black)",45100),
                new Item(105, "Z690 AORUS MASTER (rev. 1.x)", 28100), new Item(106, "EVGA SuperNOVA 750 GA, 80 Plus Gold 750W, Fully Modular, Eco Mode, 10 Year Warranty, Includes Power ON Self Tester, Compact 150mm Size, Power Supply 220-GA-0750-X1", 1200),
                new Item(107, "WD_BLACK SN850 NVMe™ SSD",14300), new Item(108, "ROG Strix Helios",15000),
                new Item(109, "Seagate BarraCuda 2TB Internal Hard Drive HDD – 3.5 Inch SATA 6Gb/s 7200 RPM 256MB Cache 3.5-Inch", 2600),
                new Item(110, "ARCTIC Liquid Freezer II 280",5900)).collect(Collectors.toList()));
    }

    public List<Item> addProduct(List<Item> products) {

        return repository.saveAll(products);
    }

    public List<Item> findAllProducts() {

        return repository.findAll();
    }

}
