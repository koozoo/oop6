package service;

import data.Shape;

public interface IRepository <T extends Shape> {
    public void add(T value);

}
