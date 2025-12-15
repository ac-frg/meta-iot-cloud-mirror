DESCRIPTION = "HTTP Library written in C"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-uhttp-c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b98fddd052bb2f5ddbcdbd417ffb26a8"

SRC_URI = "\
    git://github.com/Azure/azure-uhttp-c.git;protocol=https;branch=master \
"

SRCREV = "01dc7139d3da3141aa2017dff927db1dbbe86e49"

PV = "1.0.1+git${SRCPV}"

require ${BPN}.inc
