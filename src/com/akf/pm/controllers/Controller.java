package com.akf.pm.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.DirectoryChooser;
import jdk.nashorn.api.tree.Tree;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML private TreeView<String> treeView;

    @Override public void initialize(URL location, ResourceBundle resources) {
        treeView.setRoot(getNodesForDirectory(new File("D:\\manager")));
    }
    @FXML public void handleMouseClicked(MouseEvent mouseEvent){
        System.out.println("this works now");
    }
    public TreeItem<String> getNodesForDirectory(File directory) {
        TreeItem<String> root = new TreeItem<>(directory.getName());

        for(File f : directory.listFiles()) {
            System.out.println("Loading " + f.getName());
            if(f.isDirectory()) {
                root.getChildren().add(getNodesForDirectory(f));
            } else {
                root.getChildren().add(new TreeItem<>(f.getName()));
            }
        }
        return root;
    }
}
