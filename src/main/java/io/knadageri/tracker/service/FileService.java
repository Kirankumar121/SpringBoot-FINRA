package io.knadageri.tracker.service;

import java.util.List;

import io.knadageri.tracker.model.File;

/**
 * Created by knadageri on 7/16/17.
 */

public interface FileService {
    File findById(String id);
    List<File> findAll();
    File save(File file);
    void delete(String id);
    public List<File> save(List<File> file);
}
