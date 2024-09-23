package class_work_38.hash_Set.dao;

// Для сохранения родства между коллекциями мы всё наследуем (extends) от интерфейса Iterable,
// в котором реализуем итератор <E>.
// Сам интерфейс ISet должен быть параметризован дженериком <E> E - каким то элементом.
// ISet<E> параметризируется каким то элементом и расширяет возможности для использования методов от Iterable.

public interface ISet<E> extends Iterable<E>{

    boolean add(E element); // добавление элемента типа E

    boolean contains (Object o); // Проверка наличия элемента
                                 // Contains - содержит. Любой элемент наследуется от объекта
    boolean remove(Object o);

    int size();
}
/*
    Любой интерфейс требует имплементацию (реализацию).
    Ставим курсор на ISet и нажимаем Alt и Enter. Выбираем Implement interface.
     */
