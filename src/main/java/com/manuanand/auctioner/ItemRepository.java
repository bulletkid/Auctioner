package com.manuanand.auctioner;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.auctioner.Item;

// This will be AUTO IMPLEMENTED by Spring into a Bean called nodeRepository
// CRUD refers Create, Read, Update, Delete

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
