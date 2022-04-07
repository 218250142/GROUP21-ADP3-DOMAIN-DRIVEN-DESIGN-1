package za.ac.cput.repository;
/*Warren Jaftha(Leader) -219005303
IRepository.java
27/03/2022
 */
public interface IRepository<T,ID> {
    T create (T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);

}

