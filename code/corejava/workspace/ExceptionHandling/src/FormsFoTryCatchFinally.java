
public class FormsFoTryCatchFinally {

	public static void main(String[] args) {
		
		try {
		} catch(Exception e) {
		}
		
		//===================================
		try {
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (Exception e) {
		}
		
		//===================================
		try {
		} catch(Exception e) {
		} finally {	
		}
		
		//===================================
		try {
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (Exception e) {
		} finally {
		}
		
		//===================================		
		try {
		} finally {	
		}
		
		//===================================
		try {
			try {
				
			} catch(Exception e) {
				
			}
		} 
		catch(Exception e) {
			
		}
		//===================================
		try {
		
		} 
		catch(Exception e) {
			
		}
		finally {
			try {
				
			} catch(Exception e) {
				
			}
		}
		//===================================
		try {
			
		} 
		catch(Exception e) {
			try {
				
			} catch(Exception ex) {
				
			}
		}
	}

}
