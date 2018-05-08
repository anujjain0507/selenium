$vVariable = """D:\Sample invoices\Karmac\201609231010040000.pdf""""D:\Sample invoices\Karmac\201609231010040004.pdf"""
ControlFocus("File Upload","","Edit1")
Sleep(1000)
ControlSetText("File Upload","","Edit1",$vVariable)
Sleep(1000)
ControlClick("File Upload","","Button1")