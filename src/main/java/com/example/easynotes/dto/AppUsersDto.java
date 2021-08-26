package com.example.easynotes.dto;

import java.util.List;
import java.util.Objects;

public class AppUsersDto {

    private Long id;
    private String name;
    private String title;
    private List<AppUsersDto> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AppUsersDto> getChildren() {
        return children;
    }

    public void setChildren(List<AppUsersDto> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUsersDto that = (AppUsersDto) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
