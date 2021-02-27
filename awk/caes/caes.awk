#!/usr/bin/awk -f

BEGIN {
	print "NOME		COR		TEMPERAMENTO		PORTE"
}

{
	print $0
}

END {
	print "\n\n"
	print "Obrigado por utilizar os nossos serviços"
}
