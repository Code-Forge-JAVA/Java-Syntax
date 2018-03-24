

jSpinner
int value = (Integer) jSpinnerPinID.getValue(); // get  value from spinner
int spinnerPassword = (int)jSpinnerUserPassword.getValue() 
jSpinnerPinID.setValue(54); // set value to spinner position 


jButton
	jButtonNamesOK.setEnabled(false); // set button that can't be pressed
	jButtonNamesOK.setText("Ok");
	jTextFieldNames.getText();
	jTextFieldNames.setEditable(true);

jList
    jListUserNames.setListData(namesArray); // use to add remove purpose
    jListUserNames.getSelectedIndex()
    jListUserNames.getSelectedValue()
    jListPinscollection.setSelectedIndex(value) // select value in won box


JOption
    //JOption Message Box
     import file.data.multilines.manager.StaticFileManager; // how to import library

         int userCondition =  JOptionPane.showConfirmDialog(null,"Do you love winter","Winter quiz",JOptionPane.YES_NO_OPTION);
       	 if (userCondition == 0) 
       	 	//do something