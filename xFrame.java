public class xFrame extends JFrame{		// main class that will enclose other methods
	
		JMenu fileMenu
		JMenuItem fileMenu_New,fileMenu_Open,fileMenu_Save,fileMenu_SaveAs,fileMenu_PageSetUp,fileMenu_Print,fileMenu_Exit;
		JButton fileMenu_New, fileMenu_Open, fileMenu_Save;
		
		boolean save{}
		boolean saveas{}
		void openfile{}
		
		JButton zoom_In, zoom_Out;
		JButoon rotate_Left, rotate_Right;
		
		public void zoom{
		
		}
		
		public void rotate{
			
		}
		
		editMenu
		JMenuItem editMenu_Undo,editMenu_Cut,editMenu_Copy,editMenu_Paste,editMenu_Delete,editMenu_Find,editMenu_FindNext,editMenu_Replace,editMenu_GoTo,editMenu_SelectAll,editMenu_TimeDate;
		
		//rightClick
		JPopupMenu popupMenu;
		JMenuItem popupMenu_Undo,popupMenu_Cut,popupMenu_Copy,popupMenu_Paste,popupMenu_Delete,popupMenu_SelectAll;
		
		formatMenu
		formatMenu_LineWrap;
		formatMenu_Font;
		
		viewMenu
		viewMenu_Status;
		
		/************************************************************************************/
		
		
		JTextArea editArea;
		//clipboard
		Toolkit toolkit;
		Clipboard clipBoard;
		
		//undo
		UndoManager undo;
		JButton undo;
		public void undo{
		
		}
		
		public xFrame{
			JMenuBar menuBar=new JMenuBar();
			fileMenu=new JMenu("File");
			menuListener;
			mouseListener;
			windowListener;
			
		}
		
		public void checkmenuItem{
			//check if user have select the content or not
		}
		
		public void exitwindow{
			//check if user have save text or not, or even cancel
		}
		
		public void search{
			//find out the word
		}
		
		public void replace{
			
		}
		
		public void font{
			
		}
		
		public colorChooser{
			
		}
				
		public void pagenext{}
		puclic void pagelink(int n){}
		
			
		public void actionperformed {
			
		}
}
