package com.atividadededac.multidatabase.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "tb_data")
@Document(collection = "TbData")

public class DataModel {

    @Id
    private String code;
    private String text;
    private boolean confirmed;

    public DataModel(){
    }

    public DataModel(String code, String text, boolean confirmed){
        this.code = code;
        this.text = text;
        this.confirmed = confirmed;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
