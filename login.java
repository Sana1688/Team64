public void actionPerformed(ActionEvent event)
   {
     File inputFile = new File("USERDATA.txt");
     
     firstnameField = new JTextField(10);
     lastnameField = new JTextField(10);
     DOBField = new JTextField(10);
     
     String firstnameInput = nameField.getText();
     String NameInput = nameField.getText();
     String DOBInput = DOBField.getText();
     
     try {
            Scanner in = new Scanner(new File("USERDATA.txt"));
            while (in.hasNextLine())
            {
              String s = in.nextLine();  
              String[] sArray = s.split(" ");
              
              System.out.println(sArray[0]);
              System.out.println(sArray[1]);
              System.out.println(sArray[2]);
              
              if (firstnameInput == sArray[0] && lastnameInput == sArray[1] && DOBInput == sArray[2])
              {
            	  System.out.print("Log in sucessful");
              }
              else
              {
            	  System.out.print("Log in failed");
              }
            }
            
            in.close();
            
        } catch (FileNotFoundException e) {
            System.out.print("EROOR");
        }
    
   }