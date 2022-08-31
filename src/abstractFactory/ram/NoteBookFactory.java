package abstractFactory.ram;

import abstractFactory.computer.NoteBook;
import abstractFactory.parts.BrandPartsFactory;
import abstractFactory.computer.Computer;

/**
 * Computer 객체 생성 factory
 * ComputerPartsFactory 에 따라서 intel or amd 부품객체를 반환한다.
 */
public class NoteBookFactory {

    private BrandPartsFactory brandPartsFactory;

    /**
     * 브랜드 파츠 주입
     * @param brandPartsFactory
     */
    public NoteBookFactory(BrandPartsFactory brandPartsFactory) {
        this.brandPartsFactory = brandPartsFactory;

    }

    public Computer createNoteBook() {
            NoteBook noteBook = new NoteBook();
            noteBook.installCpu(brandPartsFactory.createCpu());
            noteBook.installRam(brandPartsFactory.createRam());
            noteBook.installBrandName(brandPartsFactory.createBrandName());
            return noteBook;
    }
}
