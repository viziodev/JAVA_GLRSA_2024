package services;

public interface IService<T> {
    public abstract boolean add(T data);
    public abstract T getByNumero(String numero);
}
