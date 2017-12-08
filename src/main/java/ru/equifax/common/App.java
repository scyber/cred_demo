package ru.equifax.common;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import ru.equifax.tmp.ExpenseT;
import ru.equifax.tmp.ItemListT;
import ru.equifax.tmp.ItemT;
import ru.equifax.tmp.ObjectFactory;
import ru.equifax.tmp.UserT;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException, IOException{
    	ObjectFactory factory = new ObjectFactory();
    	         UserT user = factory.createUserT();
        user.setUserName("Максим Пупкин");
        ItemT item = factory.createItemT();
        item.setItemName("Seagate External HDD 4 Гигабайта");
        item.setPurchasedOn("August 24, 2010");
        item.setAmount(new BigDecimal("6776.5"));
 
        ItemListT itemList = factory.createItemListT();
        itemList.getItem().add(item);
 
        ExpenseT expense = factory.createExpenseT();
        expense.setUser(user);
        expense.setItems(itemList);
 
        JAXBContext context = JAXBContext.newInstance("ru.equifax.tmp");
        JAXBElement<ExpenseT> element = factory.createExpenseReport(expense);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "windows-1251");
        OutputStream outFile = new FileOutputStream("outfile.xml");
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(element, outFile);
        //marshaller.marshal(element,System.out);
        outFile.close();;
    }
}
