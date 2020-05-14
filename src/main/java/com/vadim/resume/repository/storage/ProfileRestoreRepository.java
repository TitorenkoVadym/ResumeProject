package com.vadim.resume.repository.storage;

import com.vadim.resume.entity.ProfileRestore;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRestoreRepository extends CrudRepository<ProfileRestore,Long> {
    ProfileRestore findByToken(String token);
}
