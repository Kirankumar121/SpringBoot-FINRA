package io.knadageri.tracker.service.Impl;

import io.knadageri.tracker.dao.FileRepository;
import io.knadageri.tracker.model.File;
import io.knadageri.tracker.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * Created by knadageri on 7/16/17.
 */

@Service
public class FileServiceImpl implements FileService{


    @Autowired
    private FileRepository fileDao;

    @Override
    public File findById(String id) {
        return fileDao.findOne(id);
    }

    @Override
    @Transactional
    public List<File> findAll() {
        return fileDao.findAll();
    }

    @Override
    @Transactional
    public List<File> save(List<File> file) {

        fileDao.save(file);
        return file;
    }



    @Override
    @Transactional
    public File save(File file) {
        return fileDao.save(file);
    }


    @Override
    @Transactional
    public void delete(String id) {
        fileDao.delete(id);
    }
}
