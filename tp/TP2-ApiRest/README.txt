				REST Api in Smalltalk

Benjamin Van Ryseghem
Francois Lepan
27/03/2013


============
Introduction
============

	This is an API for the REST software architecture. It handle REST request and send them to a file manager. Here we use the previously developed FTP Server to manage files.



============
Issue
============

	The binary transfer corrupt the file probably because of a bug in the architecture.



============
Architecture
============

Packages :
----------

-----------------
	The classes that handle the REST Request and store
	login information for the TFPServer.



-----------------
	The classes that display datas retrieved from REST
	queries.




Classes:
--------

-----------------

---------------------------------------------------------
	kind of REST verb they fulfill, plus a kind of regex 
	for url matching.
	simply return what I get back.
---------------------------------------------------------
	the REST api and a way to manage files.
	REST api backend (FTP, FS, ...)
	server




---------------------------------------------------------
	to upload a file to the server
	to create a new directory
	to send an authentification to the server


---------------------------------------------------------


============
Code Samples
============

  Snippet to start the server
-----------------------------

(ZnZincServerAdaptor port: 8080)



  Snippet to generate the source file from the classes
------------------------------------------------------

packages := RPackageOrganizer default packages select:[:each |




  Snippet to generate the documentation
---------------------------------------

packages := RPackageOrganizer default packages select:[:each |
	(each name beginsWith: 'RestAPI') and: [ (each name endsWith: '-Tests') not ]].

Clipboard clipboardText: (String streamContents: [:s | 
packages do: [:p | 
	s << '================='; cr ; cr; << (p name) ; cr ; cr ; << '================='; cr .
	p definedClasses do: [:c |
		s << c name ; cr ; tab ; << (c comment) ;cr;cr
	]]])