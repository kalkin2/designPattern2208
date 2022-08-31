package abstractFactory;

import abstractFactory.computer.Computer;
import abstractFactory.parts.AmdPartsFactory;
import abstractFactory.parts.IntelPartsFactory;
import abstractFactory.ram.NoteBookFactory;

public class Client {

    public static void main(String[] args) {


        //intel brand로 주문
        NoteBookFactory intelNotebookFactory = new NoteBookFactory(new IntelPartsFactory());
        Computer intelComputer = intelNotebookFactory.createNoteBook();
        System.out.println(intelComputer.showInfo());


        //amd brand로 주문
        NoteBookFactory amdNoteBookFactory = new NoteBookFactory(new AmdPartsFactory());
        Computer amdComputer = amdNoteBookFactory.createNoteBook();
        System.out.println(amdComputer.showInfo());
    }

}
