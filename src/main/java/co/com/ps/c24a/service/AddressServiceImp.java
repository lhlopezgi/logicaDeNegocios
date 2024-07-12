package co.com.ps.c24a.service;

import co.com.ps.c24a.entity.Address;
import co.com.ps.c24a.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService{

    private final AddressRepository addressRepository;


    @Override
    public Optional<Address> getAddressById(Long id) {
        return Optional.ofNullable(addressRepository.findById(id).orElseThrow(() -> new RuntimeException("No encontro Registro"))) ;
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Long id, Address address) {
        if (!addressRepository.existsById(address.getId())) {
            throw new RuntimeException("No encontre ese address");
        }
        address.setId(id);

        return addressRepository.save(address);

    }

    @Override
    public void deleteAddress(Long id) {
            if(!addressRepository.existsById(id)){
                throw new RuntimeException("No encontre ese address");
            }
            addressRepository.deleteById(id);
        }

    }

