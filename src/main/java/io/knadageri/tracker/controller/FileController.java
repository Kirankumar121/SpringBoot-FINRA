package io.knadageri.tracker.controller;

import io.knadageri.tracker.exception.ResourceNotFoundException;
import io.knadageri.tracker.model.File;
import io.knadageri.tracker.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by knadageri on 7/16/17.
 */

@RestController
public class FileController {

    @Autowired
    private  FileService fileService;

    @RequestMapping(method = RequestMethod.GET,value = "files")
    @ApiOperation(value = "Find all Files metadata",notes = "Displays all the Files in the DB")

    List<File>  findAllFile(){
        return fileService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "file/{id}")
    @ApiOperation(value = "Find File By Id",notes = "Displays the File for the ID provided from the DB")

    File  findFileById(@PathVariable("id") String id){
       File file = fileService.findById(id);
       if(file == null){
           throw new ResourceNotFoundException("File Not Found");
       }
       else{
           return file;
       }
    }

    @RequestMapping(value = "file",method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ApiOperation(value = "Create new File",notes = "Displays the File created ")

    File create(@RequestBody File file){
        return fileService.save(file);
    }

    @RequestMapping(value = "files",method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    @ApiOperation(value = "Update the file",notes = "Displays the File Updated ")

    List<File> create(@RequestBody List<File> file){
        return fileService.save(file);
    }

    @RequestMapping(value = "files",method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )

    List<File> update(@RequestBody File[] file){

        for (File f:  file) {
            fileService.save(f);
        }
        return Arrays.asList(file) ;
    }

    @RequestMapping(value = "file/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete File",notes = "Removes the File identified by fileId ")

    void update(@PathVariable("id") String  id){
        fileService.delete(id);
    }

}
