DESCRIPTION = "Google Cloud API client core library"
HOMEPAGE = "https://github.com/googleapis/python-cloud-core"
AUTHOR = "Google LLC"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
    python3-google-api-core \
    python3-google-auth \
    python3-grpcio \
    python3-grpcio-status \
"

SRC_URI[sha256sum] = "7c1b7ef5c92311717bd05301aa1a91ffbc565673d3b0b4163a52d8413a186963"

PYPI_PACKAGE = "google_cloud_core"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
