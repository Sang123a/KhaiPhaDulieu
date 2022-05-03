/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong05.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author ADMIN
 */
public class TreeDemoModel implements TreeModel {
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        rootNode = BuildTree("Car&Motor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode BuildTree(String rootName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        
        root.add(car);
        root.add(motor);
        
        DefaultMutableTreeNode Honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode Mazda = new DefaultMutableTreeNode("Mazda");
        DefaultMutableTreeNode Toyota = new DefaultMutableTreeNode("Toyota");
        car.add(Honda);
        car.add(Mazda);
        car.add(Toyota);
        
        DefaultMutableTreeNode Suzuki = new DefaultMutableTreeNode("Suzuki");
        DefaultMutableTreeNode Yamaha = new DefaultMutableTreeNode("yamaha");
        motor.add(Yamaha);
        motor.add(Suzuki);
        
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNodel() {
        return rootNode;
    }

    public void setRootNodel(DefaultMutableTreeNode rootNodel) {
        this.rootNode = rootNode;
    }
    
    
    @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        tree.removeTreeModelListener(l);
    }
    
}
