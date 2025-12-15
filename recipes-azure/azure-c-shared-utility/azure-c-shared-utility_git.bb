DESCRIPTION = "Azure C Shared Utility"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-c-shared-utility"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4283671594edec4c13aeb073c219237a"

SRC_URI = "\
    git://github.com/Azure/azure-c-shared-utility.git;protocol=https;branch=master \
"

SRCREV = "772a4f8bc338140b4a0f404cf9c344283c5c937f"

PV = "1.1.12+git${SRCPV}"

require ${BPN}.inc
