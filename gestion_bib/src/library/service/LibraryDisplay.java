
package library.service;

import library.model.Lendable;

public class LibraryDisplay {

    public void listAllItems(Library library) {
        for (Lendable item : library.getAllItems()) {
            System.out.println(item.getDescription());
        }
    }
}
