package co.com.ps.c24a.controller;

import co.com.ps.c24a.entity.Address;
import co.com.ps.c24a.entity.Person;
import co.com.ps.c24a.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/{id}")
    public Address getAddresssById(@PathVariable Long id) {
        return addressService.getAddressById(id).orElseThrow(() -> new RuntimeException("No se encontró el id"));
    }

    @PostMapping
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable Long id, @RequestBody Address address) {
        return addressService.updateAddress(id, address);

    }
}
