package com.example.exampleinheritancemodelrecyclerview;

public class ExternModel extends ModelAdapter {
    private String id;
    private String titulo;
    private String descripcion;
    private String imagen;

    public void setTitle(String title) {
        this.titulo = title;
    }

    public void setDescription(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    String getTitle() {
        return titulo;
    }

    @Override
    String getDescription() {
        return descripcion;
    }

    @Override
    int getLabel() {
        return 0;
    }

}
