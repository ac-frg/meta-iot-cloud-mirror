DESCRIPTION = "uAMQP is a general purpose C library for AMQP"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-uamqp-c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4283671594edec4c13aeb073c219237a"

SRC_URI = "git://github.com/Azure/azure-uamqp-c.git;protocol=https;branch=master"

SRCREV = "6bb9accbbc036ed5ef1df7467760762c99a7094b"

PV = "1.2.12+git${SRCPV}"

include ${BPN}.inc
