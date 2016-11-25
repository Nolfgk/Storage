package com.spoloborota.teaching.storage.processor.type;


import com.spoloborota.teaching.storage.model.RAM;

public class Save {

    public static String process(RAM ram) {
        boolean isSaved = ram.save();
        if (isSaved) {
            return ram.currentStorage.name + " saved";
        } else {
            return "Could not save file";
        }
    }
}
