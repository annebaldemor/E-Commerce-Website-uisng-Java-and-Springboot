package com.middle.app.midrest.Controller;

import com.middle.app.midrest.Models.AddToCart;
import com.middle.app.midrest.Repo.AddToCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddToCartController {

    @Autowired
    private AddToCartRepo addToCartRepo;

    @GetMapping(value = "/Available-Items")
    public String getPage() {
        return "Welcome to Malolos and Makati PC Shop! \n" +
                "\n" +
                "Here are the available items as of June 2022:\n" +
                "\n"
                + "Dell 32 Curved Gaming Monitor – S3222DGM\n" +
                "Item Code: [DELL32CGM]\n" +
                "Price: ₱15,900\n" +
                "Stocks : 12\n" +
                "\n" +
                "Intel® Core™ i9-12900K Processor\n" +
                "Item Code: [IC9P]\n" +
                "Price: ₱31,800\n" +
                "Stocks : 15\n" +
                "\n" +
                "ASUS TUF RTX 3090 TI GAMING OC TUF-RTX3090TI-O24G-GAMING\n" +
                "Item Code: [ASUSTR3090]\n" +
                "Price: ₱103,300\n" +
                "Stocks : 6\n" +
                "\n" +
                "Crucial Ballistix MAX 5100 MHz DDR4 DRAM Desktop Gaming Memory Kit 16GB (8GBx2) CL19 BLM2K8G51C19U4B (Black)\n" +
                "Item Code: [CBMDDR4DGMK16GB]\n" +
                "Price: ₱45,100\n" +
                "Stocks : 9\n" +
                "\n" +
                "Z690 AORUS MASTER (rev. 1.x)\n" +
                "Item Code: [AMZ690]\n" +
                "Price: ₱28,100\n" +
                "Stocks : 10\n" +
                "\n" +
                "EVGA SuperNOVA 750 GA, 80 Plus Gold 750W, Fully Modular, Eco Mode, 10 Year Warranty, Includes Power ON Self Tester, Compact 150mm Size, Power Supply 220-GA-0750-X1\n" +
                "Item Code: [EVGASN750GA]\n" +
                "Price: ₱12,000\n" +
                "Stocks : 12\n" +
                "\n" +
                "WD_BLACK SN850 NVMe™ SSD\n" +
                "Item Code: [SSDWDBSN850]\n" +
                "Price: ₱14,300\n" +
                "Stocks : 5\n" +
                "\n" +
                "ROG Strix Helios\n" +
                "Item Code: [ROGSHELIOS]\n" +
                "Price: ₱15,000\n" +
                "Stocks : 20\n" +
                "\n" +
                "Seagate BarraCuda 2TB Internal Hard Drive HDD – 3.5 Inch SATA 6Gb/s 7200 RPM 256MB Cache 3.5-Inch\n" +
                "Item Code: [SG2TBHD]\n" +
                "Price: ₱2,600\n" +
                "Stocks : 16\n" +
                "\n" +
                "ARCTIC Liquid Freezer II 280\n" +
                "Item Code: [ALFII280]\n" +
                "Price: ₱5,900\n" +
                "Stocks : 7\n" +
                "\n" +
                "If you wish to order, just click this link: http://localhost:8080/save ";
    }

    @GetMapping(value = "/orders")
    public List<AddToCart> getOrders() {
        return addToCartRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveOrder(@RequestBody AddToCart addToCart) {
        addToCartRepo.save(addToCart);
        return "Your order items are already saved" + "\nTo see the items in your cart, just click this link:"
                + "http://localhost:8080/orders\n" +
                "If you wish to delete it, just put your order id in this link: http://localhost:8080/delete/\n " +
                "If you want to checkout your oder, just proceed in this link: http://localhost:8080/checkoutItems";
    }

    @PutMapping(value = "/update/{id}")
    public String updateOrder(@PathVariable long id, @RequestBody AddToCart addToCart) {
        AddToCart updatedAddToCart = addToCartRepo.findById(id).get();
        updatedAddToCart.setProductName(addToCart.getProductName());
        updatedAddToCart.setProductCode(addToCart.getProductCode());
        updatedAddToCart.setPrice(addToCart.getPrice());
        addToCartRepo.save(updatedAddToCart);
        return "Your order has been updated" + "\nTo see your updated orders, just click this link:"
                + "http://localhost:8080/orders" + "If you wish to delete it, just put your order id in this link: http://localhost:8080/delete/\n " +
                "If you want to checkout your oder, just proceed in this link: http://localhost:8080/checkoutItems";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteOrder(@PathVariable long id) {
        AddToCart deleteOrder = addToCartRepo.findById(id).get();
        addToCartRepo.delete(deleteOrder);
        return "Delete order with the id: " + id + "\nTo see what are the available items, just click this link:http://localhost:8080/Available-Items";
    }

    @GetMapping(value = "/DELL32CGM")
    public String getItem1() {
        return "Dell 32 Curved Gaming Monitor – S3222DGM\n" +
                "Item Code: [DELL32CGM]\n" +
                "Price: ₱15,900\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/IC9P")
    public String getItem2() {
        return "Intel® Core™ i9-12900K Processor\n" +
                "Item Code: [IC9P]\n" +
                "Price: ₱31,800\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/ASUSTR3090")
    public String getItem3() {
        return "ASUS TUF RTX 3090 TI GAMING OC TUF-RTX3090TI-O24G-GAMING\n" +
                "Item Code: [ASUSTR3090]\n" +
                "Price: ₱103,300\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/CBMDDR4DGMK16GB")
    public String getItem4() {
        return "Crucial Ballistix MAX 5100 MHz DDR4 DRAM Desktop Gaming Memory Kit 16GB (8GBx2) CL19 BLM2K8G51C19U4B (Black)\n" +
                "Item Code: [CBMDDR4DGMK16GB]\n"
                + "Price: ₱45,100\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/AMZ690")
    public String getItem5() {
        return "Z690 AORUS MASTER (rev. 1.x)\n" + "Item Code: [AMZ690]\n" +
                "Price: ₱28,100\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/EVGASN750GA")
    public String getItem6() {
        return "EVGA SuperNOVA 750 GA, 80 Plus Gold 750W, Fully Modular, Eco Mode, 10 Year Warranty, Includes Power ON Self Tester, Compact 150mm Size, Power Supply 220-GA-0750-X1\n" +
                "Item Code: [EVGASN750GA]\n" + "Price: ₱12,000\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/SSDWDBSN850")
    public String getItem7() {
        return "WD_BLACK SN850 NVMe™ SSD\n" +
                "Item Code: [SSDWDBSN850]\n" +
                "Price: ₱14,300\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/ROGSHELIOS")
    public String getItem8() {
        return "ROG Strix Helios\n" +
                "Item Code: [ROGSHELIOS]\n" +
                "Price: ₱15,000\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/SG2TBHD")
    public String getItem9() {
        return "Seagate BarraCuda 2TB Internal Hard Drive HDD – 3.5 Inch SATA 6Gb/s 7200 RPM 256MB Cache 3.5-Inch\n" +
                "Item Code: [SG2TBHD]\n" +
                "Price: ₱2,600\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";
    }

    @GetMapping(value = "/ALFII280")
    public String getItem10() {
        return "ARCTIC Liquid Freezer II 280\n" +
                "Item Code: [ALFII280]\n" +
                "Price: ₱5,900\n" + "If you wish to add this item into your cart, just click this link:http://localhost:8080/save";

    }
}
