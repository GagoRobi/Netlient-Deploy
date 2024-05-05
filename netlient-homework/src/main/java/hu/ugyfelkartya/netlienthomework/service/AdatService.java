package hu.ugyfelkartya.netlienthomework.service;

import hu.ugyfelkartya.netlienthomework.model.Dto.AdatDTO;
import hu.ugyfelkartya.netlienthomework.model.entity.Adat;
import hu.ugyfelkartya.netlienthomework.repository.AdatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdatService {
    private final AdatRepository adatRepository;

    public Page<Adat> findAll(PageRequest pageRequest){
        return adatRepository.findAll(pageRequest);
    }

    public Page<Adat> findAllByNameContaining(String searchText, PageRequest pageRequest){
        return adatRepository.findAllByNameContainingIgnoreCase(searchText,pageRequest);
    }
    public List<Adat> addAdatArray(List<AdatDTO> adatDTOs){
        List<Adat> adatList = new ArrayList<>();
        adatList = adatDTOs.stream().map((e)-> Adat.builder().name(e.name()).price(e.price()).vat(e.vat()).build()).toList();
        return adatRepository.saveAll(adatList);
    }


}
