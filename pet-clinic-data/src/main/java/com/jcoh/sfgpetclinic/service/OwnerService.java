package com.jcoh.sfgpetclinic.service;

import com.jcoh.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
