package io.mdfitumi.unittest.models;

import io.mdfitumi.unittest.dto.FileObjDTO;
import io.mdfitumi.unittest.dto.PagerDTO;

import java.util.ArrayList;
import java.util.List;

public class FileResponse {
    private String message;
    private Boolean success;
    private List<FileObjDTO> pages = new ArrayList<>();
    private PagerDTO pager;

    public PagerDTO getPagerDTO() {
        return this.pager;
    }
    public void setPagerDTO(PagerDTO dto) {
        this.pager = dto;
    }

    public String getMessage() {
        return message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setFileObjPages(List<FileObjDTO> pages) {
        this.pages = pages;
    }

    public List<FileObjDTO> getFileObjPages() {
        return this.pages;
    }
}
