DESCRIPTION = "Beautiful, Pythonic protocol buffers."
HOMEPAGE = "https://github.com/googleapis/proto-plus-python.git"
AUTHOR = "Google LLC"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-protobuf \
"

SRC_URI[sha256sum] = "21a515a4c4c0088a773899e23c7bbade3d18f9c66c73edd4c7ee3816bc96a012"\

PYPI_PACKAGE = "proto_plus"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
