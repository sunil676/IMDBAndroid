package com.example;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class GreenDaoMain {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.sunil.imdbandroid.db.model");
        addImdb(schema);
        new DaoGenerator().generateAll(schema, "../IMDBAndroid/app/src/main/java/");
    }

    private static void addImdb(Schema schema) {

        Entity imdb = schema.addEntity("IMBD");
        imdb.addIdProperty();
        imdb.addIntProperty("movie_id").notNull();
        imdb.addStringProperty("name");
        imdb.addIntProperty("yearofrelease");
        imdb.addDoubleProperty("rating");
        imdb.addStringProperty("imageurl");
        imdb.addStringProperty("detailLink");

    }
}
