package org.listasforeach.stringbuilder;

import org.listasforeach.stringbuilder.entities.Comment;

import java.text.SimpleDateFormat;

public class App {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");

    }
}
