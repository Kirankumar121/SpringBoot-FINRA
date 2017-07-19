package io.knadageri.tracker.dao;

import org.springframework.data.repository.Repository;

import io.knadageri.tracker.model.File;

import java.util.List;

/**
 * Created by knadageri on 7/16/17.
 */

public interface FileRepository extends Repository<File,String> {

     File findOne(String id);
     List<File> findAll();
     File save(File file);
     void delete(String id);
     List<File> save(List<File> file);
}
