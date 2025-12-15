DESCRIPTION = "Microsoft Azure IoT SDKs and libraries for C"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4283671594edec4c13aeb073c219237a"

SRC_URI = "\
    git://github.com/Azure/azure-iot-sdk-c.git;protocol=https;branch=main \
"

SRCREV = "5f11fab75f980591c7fabd861617addb6b7814df"

PV = "1.15.0+git${SRCPV}"

include ${BPN}.inc
