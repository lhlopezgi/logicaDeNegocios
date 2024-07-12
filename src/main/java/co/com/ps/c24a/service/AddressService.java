package co.com.ps.c24a.service;

import co.com.ps.c24a.entity.Address;

import java.util.Optional;

public interface AddressService {

    Optional<Address> getAddressById(Long id);
    Address saveAddress(Address address);
    Address updateAddress(Long id, Address address);
    void deleteAddress(Long id);

}
