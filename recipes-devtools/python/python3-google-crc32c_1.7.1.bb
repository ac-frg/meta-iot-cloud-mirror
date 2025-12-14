DESCRIPTION = "A python wrapper of the C library Google CRC32C"
HOMEPAGE = "https://github.com/googleapis/python-crc32c"
AUTHOR = "Google LLC"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

DEPENDS += "\
    ${PYTHON_PN}-cffi-native \
    crc32c \
"

SRC_URI[sha256sum] = "2bff2305f98846f3e825dbeec9ee406f89da7962accdb29356e4eadc251bd472"

PYPI_PACKAGE = "google_crc32c"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
