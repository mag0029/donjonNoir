package com.tactfactory.asciiart;

import com.tactfactory.asciiart.entities.alphabets.advancealphabet.AdvanceAlphabetSimpleImplementation;
import com.tactfactory.asciiart.managers.AsciiManager;
import com.tactfactory.asciiart.utils.ScannerProvider;

/**
 * Cette classe est le point d'entré de mon application.
 * @author antoine.cronier
 *
 */
public class Application {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AsciiManager manager = new AsciiManager(new AdvanceAlphabetSimpleImplementation());
		
		while (true) {
			manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		}
	}
}
