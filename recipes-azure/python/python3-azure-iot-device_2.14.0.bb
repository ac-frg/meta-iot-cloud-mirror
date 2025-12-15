DESCRIPTION = "Microsoft Azure IoT Device Library"
AUTHOR = "Microsoft Corporation"
HOMEPAGE = "https://github.com/Azure/azure-iot-sdk-python/tree/master/azure-iot-device"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-deprecation \
    python3-janus \
    python3-paho-mqtt \
    python3-pysocks \
    python3-requests \
    python3-requests-unixsocket \
    python3-six \
    python3-urllib3 \
    python3-typing-extensions \
"

SRC_URI[sha256sum] = "b6d48d4932c240025736ace544c4e71bc49a1576ac998ea1de778af82496ffce"

PYPI_PACKAGE = "azure_iot_device"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
